public class RateLimitConfig {
    private final int capacity;
    private final int refillRate; // tokens per second

    public RateLimitConfig(int capacity, int refillRate) {
        this.capacity = capacity;
        this.refillRate = refillRate;
    }

    public int getCapacity() {
        return capacity;
    }
    public int getRefillRate() {
        return refillRate;
    }
}
