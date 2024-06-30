package com.otaku.api.exception;

public class PostNotFound extends OtakuException {
    private  static final String MESSAGE = "존재하지 않는 글입니다.";

    public PostNotFound() {
        super(MESSAGE);
    }

    @Override
    public int getStatusCode() {
        return 404;
    }
//    public PostNotFound(Throwable cause) {
//        super(MESSAGE, cause);
//    }
}
