class RandomizedSet() {
    private val set = HashSet<Int>()
    fun insert(`val`: Int): Boolean {
        val exists = set.contains(`val`);
        set.add(`val`)
        return !exists;
    }

    fun remove(`val`: Int): Boolean {
        val exists = set.contains(`val`);
        set.remove(`val`)
        return exists;
    }

    fun getRandom(): Int {
        val list = ArrayList(set)
        return list[kotlin.random.Random.nextInt(list.size)]
    }

}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * var obj = RandomizedSet()
 * var param_1 = obj.insert(`val`)
 * var param_2 = obj.remove(`val`)
 * var param_3 = obj.getRandom()
 */