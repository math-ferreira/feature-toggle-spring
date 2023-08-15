package com.toggle.feature;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import static com.toggle.feature.MyFeaturesEnum.FEATURE_ONE;
import static com.toggle.feature.MyFeaturesEnum.FEATURE_TWO;

@Controller
public class TestController {

    @GetMapping("/feature-one")
    public ResponseEntity<?> featureOne() {
        if (FEATURE_ONE.isActive()) {
            return ResponseEntity.ok("FEATURE_ONE is active");
        } else {
            return ResponseEntity.ok("FEATURE_ONE is not active");
        }
    }

    @GetMapping("/feature-two")
    public ResponseEntity<?> featureTwo() {
        if (FEATURE_TWO.isActive()) {
            return ResponseEntity.ok("FEATURE_TWO is active");
        } else {
            return ResponseEntity.ok("FEATURE_TWO is not active");
        }
    }

}
