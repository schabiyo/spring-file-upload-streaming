package com.example.upload;

/**
 * Created by sanichabiyo on 2016-09-18.
 */
public class Response {
        /** Boolean indicating if request succeeded **/
        private boolean status;

        /** Message indicating error if any **/
        private String message;

        /** Additional data that is part of this response **/
        private String data;

        public Response(boolean status, String message, String data) {
            this.status = status;
            this.message = message;
            this.data = data;
        }

    public String getMessage() {
        return message;
    }

    public boolean isStatus() {
        return status;
    }

    public String getData() {
        return data;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void setData(String data) {
        this.data = data;
    }

    // Setters and getter
}
