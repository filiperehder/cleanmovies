package frog.cleanmovies.data.model

/**
 * Created by Filipe Rehder on 05/03/2018.
 */
data class DiscoverMovieRequestEntity (val language : String,
                                       val sort_by : String,
                                       val include_adult : Boolean,
                                       val page : Int,
                                       val year : String)