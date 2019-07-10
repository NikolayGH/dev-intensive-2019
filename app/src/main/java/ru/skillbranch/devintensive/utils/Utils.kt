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
        val str1 = if(!firstName.equals(" ")&&!firstName.equals(""))firstName?.get(0)?.toUpperCase()else null
        val str2 = if(!lastName.equals(" ")&&!lastName.equals(""))lastName?.get(0)?.toUpperCase()else null
        if(str1==null && str2!=null){
            return str2.toString()
        }else if(str2==null && str1!=null){
            return str1.toString()
        }else if(str1==null && str2==null){
            return null
        }else if(str1!=null && str2!=null){
            return "$str1$str2"
        }

        return null

    }


}