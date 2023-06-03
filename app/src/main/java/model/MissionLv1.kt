package model

import java.io.Serializable

data class MissionLv1(
    val level: Int,
    val check_ans: Boolean?,
    override val title: String,

) : Serializable, Mission{
    constructor():this(0, null, "")
}
