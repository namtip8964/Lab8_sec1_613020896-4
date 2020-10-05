package layout

data class Student(
    @Expose
    @SerializedName("std_id") val std_id:String,

    @Expose
    @SerializedName("std_name") val std_name:String,

    @Expose
    @SerializedName("std_age") val std_age:Int) {}