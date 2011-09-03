package com.sailthru.client.exceptions;

/**
 *
 * @author Prajwal Tuladhar <praj@sailthru.com>
 */
public class ResourceNotFoundException extends ApiException {
    public ResourceNotFoundException(int statusCode, String reason, Object jsonResponse) {
        super(statusCode, reason, jsonResponse);
    }
}
