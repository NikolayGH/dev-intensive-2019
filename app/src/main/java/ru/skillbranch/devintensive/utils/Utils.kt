package ru.skillbranch.devintensive.utils

object Utils {
    fun parseFullName(fullName: String?): Pair<String?, String?>{
        //TODO Fix me!!!
        val parts: List<String>?  = fullName?.split(" ")
        val firstName : String? =  if(parts?.getOrNull(0).equals("")||parts?.getOrNull(0).equals(" ")) null else parts?.getOrNull(0)
        val lastName : String? = if(parts?.getOrNull(1).equals("")||parts?.getOrNull(1).equals(" ")) null else parts?.getOrNull(1)
        return firstName to lastName
    }

    fun transliteration(payload: String, divider: String = " "): String {
        TODO ("not implemented")
    }

    fun toInitials(firstName: String?, lastName: String?): String? {
        TODO ("not implemented")
    }


}