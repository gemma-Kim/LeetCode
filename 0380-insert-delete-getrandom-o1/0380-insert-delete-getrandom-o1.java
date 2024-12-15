class RandomizedSet {
    private Set<Integer> set;
    public RandomizedSet() {
        set = new HashSet<>();
    }
    
    public boolean insert(int val) {
        boolean exists = set.contains(val); 
        if (exists) return false;
        set.add(val);
        return true;
    }
    
    public boolean remove(int val) {
        boolean exists = set.contains(val);
        if (exists) set.remove(val);
        return exists;
    }
    
    public int getRandom() {
        List<Integer> list = new ArrayList<>(set);
        Random random = new Random();
        return list.get(random.nextInt(list.size()));
    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */