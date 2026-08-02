package com.exam.controller;

import com.exam.exceptions.UserNotFoundException;
import com.exam.jwt.JWtResponse;
import com.exam.jwt.JwtRequest;
import com.exam.jwt.JwtUtil;
import com.exam.services.impl.UserDetailsServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.DisabledException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class AuthenticationController {
    @Autowired
    private AuthenticationManager authenticationManager;
    @Autowired
    private UserDetailsServiceImpl userDetailsService;
    @Autowired
    private JwtUtil jwtUtil;


    //generate token
    @PostMapping("/generate-token")
    public ResponseEntity<?> generateToken(@RequestBody JwtRequest jwtRequest) throws Exception {
        try{
            authenticate(jwtRequest.getUsername(), jwtRequest.getPassword());
        }
         catch (UserNotFoundException e) {
            e.printStackTrace();
            throw new Exception("User not found !!");
        }
        ///authenticated
        UserDetails userDetails = this.userDetailsService.loadUserByUsername(jwtRequest.getUsername());
        String token = this.jwtUtil.generateToken(userDetails);
        return ResponseEntity.ok(new JWtResponse(token));
    }

    public void authenticate(String username, String password) throws Exception {
        try{
            authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(username, password));
        }
        catch (DisabledException e){
            throw new Exception("User is Disabled" + e.getMessage());
        }
        catch (BadCredentialsException e){
            throw new Exception("Invalid Credentials" + e.getMessage());
        }
    }
}
