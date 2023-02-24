package com.zonebug.debugging.controller;

import com.zonebug.debugging.dto.response.KakaoResponseDTO;
import com.zonebug.debugging.service.OAuthService;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/oauth")
public class OAuthController {

    private final OAuthService oauthService;

    public OAuthController(OAuthService oauthService) {
        this.oauthService = oauthService;
    }

    @GetMapping("/kakao")
    public ResponseEntity<KakaoResponseDTO> signUp(@Valid @RequestParam(name = "code") String code) {
        return ResponseEntity.ok(oauthService.signUp(code));
    }

//    @PostMapping("/")
//    public ResponseEntity<LoginDto> signIn(){
//        return ResponseEntity.ok(oauthService.signIn);
//    }
}
