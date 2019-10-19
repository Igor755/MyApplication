import com.google.gson.annotations.SerializedName

/*
Copyright (c) 2019 Kotlin Data Classes Generated from JSON powered by http://www.json2kotlin.com

Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated documentation files (the "Software"), to deal in the Software without restriction, including without limitation the rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.

For support, please feel free to contact me at https://www.linkedin.com/in/syedabsar */


data class FilmDataClass (

	@SerializedName("countries") val countries : String,
	@SerializedName("duration") val duration : Int,
	@SerializedName("partner") val partner : String,
	@SerializedName("actors") val actors : String,
	@SerializedName("image") val image : String,
	@SerializedName("content_group_ptr") val content_group_ptr : Int,
	@SerializedName("favorites") val favorites : Int,
	@SerializedName("adult") val adult : Int,
	@SerializedName("description") val description : String,
	@SerializedName("genres") val genres : String,
	@SerializedName("year") val year : Int,
	@SerializedName("content_type_ptr") val content_type_ptr : Int,
	@SerializedName("partner_path") val partner_path : String,
	@SerializedName("added") val added : String,
	@SerializedName("id") val id : Int,
	@SerializedName("locked") val locked : Int,
	@SerializedName("name") val name : String,
	@SerializedName("comments") val comments : String,
	@SerializedName("director") val director : String,
	@SerializedName("created") val created : String,
	@SerializedName("age") val age : String,
	@SerializedName("status") val status : Int
)