package com.company.authserver.view;

import com.company.authserver.service.JwtUserDetailsService;
import com.company.authserver.view.util.JwtTokenUtil;
import io.jsonwebtoken.ExpiredJwtException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthController {

    @Autowired
    private JwtUserDetailsService jwtUserDetailsService;
    @Autowired
    private JwtTokenUtil jwtTokenUtil;

    @GetMapping(path = "/auth")
    public HttpStatus auth(@RequestHeader(value = "token", required = false) String token) {
//        String username = null;
//        String jwtToken = null;
//        if (token != null && token.startsWith("Bearer ")) {
//            jwtToken = token.substring(7);
//            try {
//                username = jwtTokenUtil.getUsernameFromToken(jwtToken);
//            } catch (IllegalArgumentException e) {
//                System.out.println("Unable to get JWT Token");
//            } catch (ExpiredJwtException e) {
//                System.out.println("JWT Token has expired");
//            }
//        }
//        if (username != null && SecurityContextHolder.getContext().getAuthentication() == null) {
//            UserDetails userDetails = this.jwtUserDetailsService.loadUserByUsername(username);
//            if (jwtTokenUtil.validateToken(jwtToken, userDetails)) {
//                return HttpStatus.OK;
//            }
//        }
        return HttpStatus.OK;
    }
}
