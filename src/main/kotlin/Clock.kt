class Clock(private var hour: Int, private var minute: Int) {

    init {
        add(0)
    }

    fun subtract(minutes: Int) {
        add(-minutes)
    }

    fun add(minutes: Int) {
        hour = (hour + ((minute + minutes).floorDiv(60))).floorMod(24)
        minute = (minute + minutes).floorMod(60)
    }

    override fun toString(): String {
        return "$hour".padStart(2, '0') + ":" +
                "$minute".padStart(2, '0')
    }

    override fun equals(other: Any?): Boolean =
            this.toString() == other.toString()

    private fun Int.floorMod(n: Int): Int =
            Math.floorMod(this, n)

    private fun Int.floorDiv(n: Int): Int =
            Math.floorDiv(this, n)
}
