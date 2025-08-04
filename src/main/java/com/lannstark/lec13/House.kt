package com.lannstark.lec13

class House(
    private val address: String,
    private val livinRoom: LivinRoom,
) {
    class LivinRoom(
        private val area: Double,
    )
}