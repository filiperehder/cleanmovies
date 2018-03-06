package frog.cleanmovies.api.movies.model

data class DiscoverMovieRequest(val language : String,
                                val sort_by : String,
                                val include_adult : Boolean,
                                val page : Int,
                                val year : String)