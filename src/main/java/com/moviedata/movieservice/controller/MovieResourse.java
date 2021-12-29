package com.moviedata.movieservice.controller;

import com.moviedata.movieservice.bean.MovieBean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MovieResourse {

    @GetMapping("/movie/{userId}")
   public MovieBean getMovieDetailsForUser(@PathVariable("userId")  int userId )
   {


      return new MovieBean("Transformer","Great Movie",userId);

   }

}
