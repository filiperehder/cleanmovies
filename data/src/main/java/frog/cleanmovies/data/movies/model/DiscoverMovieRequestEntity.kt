package frog.cleanmovies.data.movies.model

data class DiscoverMovieRequestEntity (val language : String,
                                       val sort_by : String,
                                       val include_adult : Boolean,
                                       val page : Int,
                                       val year : String)