package com.example.aspectjltw;

import com.example.aspectjltw.service.SampleService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

@SpringBootTest
class AspectjLtwApplicationTests {

    @Autowired
    private SampleService sampleService;

    @Test
    public void shouldInterceptPrivateMethod() {

        var resultFromPublicMethod = sampleService.proceed("original");
        assertThat(resultFromPublicMethod, is(equalTo("[intercepted public] [intercepted private]")));
    }

}
