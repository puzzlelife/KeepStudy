package com.wangyao.common.exception;

import java.io.Serializable;

public class ErrorCode implements Serializable {
        private static final long serialVersionUID = -6239192959362321352L;
        private int code;
        private String message;
        private Object[] param;

        public ErrorCode() {
        }

        public ErrorCode(int code, String message) {
            this.code = code;
            this.message = message;
        }

        public ErrorCode(int code, String message, Object... param) {
            this.code = code;
            this.message = String.format(message, param);
            this.param = param;
        }

        public int getCode() {
            return this.code;
        }

        public void setCode(int code) {
            this.code = code;
        }

        public String getMessage() {
            return this.message;
        }

        public void setMessage(String message) {
            this.message = message;
        }

        public Object[] getParam() {
            return this.param;
        }

        public void setParam(Object[] param) {
            this.param = param;
        }

        public String toString() {
            StringBuilder builder = new StringBuilder();
            builder.append("ErrorCode [code=");
            builder.append(this.code);
            builder.append(", message=");
            builder.append(this.message);
            builder.append("]");
            return builder.toString();
        }
}

