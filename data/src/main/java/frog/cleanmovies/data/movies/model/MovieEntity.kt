package frog.cleanmovies.data.movies.model
data class MovieEntity (val id: Int,
                        val vote_average: Double,
                        val title : String,
                        val genre_ids : List<Int>,
                        val backdrop_path : String?,
                        val overview : String,
                        val release_date : String,
                        val poster_path : String?)