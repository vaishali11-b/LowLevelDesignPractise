package config;
import java.util.HashMap;
import java.util.Map;

public class RateLimitConfigRegistry {
    private static final Map<UserTier , RateLimitConfig> configMap = new HashMap<>();

    static{
        configMap.put(UserTier.FREE, new RateLimitConfig(5, 1)); // 100 requests capacity, refills 10 tokens/sec
        configMap.put(UserTier.PREMIUM, new RateLimitConfig(20, 5)); // 1000 requests capacity, refills 100 tokens/sec
    }

    private RateLimitConfigRegistry() {
        // private constructor to prevent instantiation
    }

    public static RateLimitConfig getConfig(UserTier tier) {
        return configMap.get(tier);
    }
}
