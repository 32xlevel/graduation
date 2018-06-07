package ru.s32xlevel.util.exception;

public class IllegalRequestDataException extends RuntimeException {
    public IllegalRequestDataException(String message) {
        super(message);
    }

    @Override
    public String toString() {
        return getMessage();
    }
}
