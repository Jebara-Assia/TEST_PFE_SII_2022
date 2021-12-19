package sii.maroc.Exceptions;

public class UnavailableDishException extends RestaurantException {
    public UnavailableDishException(String message, Throwable cause) {
        super(message, cause);
    }
}