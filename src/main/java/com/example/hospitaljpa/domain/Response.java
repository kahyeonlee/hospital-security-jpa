package com.example.hospitaljpa.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class Response<T> {
    private String resultCode;
    private T result;

    // error가 발생하는 경우 작동하는 메소드
    public static Response<Void> error(String resultCode) {
        return new Response(resultCode, null);
    }

    // 에러가 발생하지 않고 ResponseDto를 통해 결과가 넘어오는 경우
    public static <T> Response<T> success(T result) {
        return new Response("SUCCESS", result);
    }

}