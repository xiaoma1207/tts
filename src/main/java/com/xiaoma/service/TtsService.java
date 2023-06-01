package com.xiaoma.service;


import org.springframework.transaction.annotation.Transactional;

@Transactional
public interface TtsService {

    public void tts();
}
