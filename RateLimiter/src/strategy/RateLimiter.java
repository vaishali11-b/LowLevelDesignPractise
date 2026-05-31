package strategy;

import model.User;

public interface RateLimiter {

    boolean isAllowed(User user);
    
}
