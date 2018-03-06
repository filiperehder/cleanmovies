package frog.cleanmovies.domain.movies.model

data class MovieRequest (val language : String,
                         val sort_by : String,
                         val include_adult : Boolean,
                         val page : Int,
                         val year : String)