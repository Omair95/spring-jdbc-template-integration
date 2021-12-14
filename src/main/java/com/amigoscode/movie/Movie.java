package com.amigoscode.movie;

import com.amigoscode.actor.Actor;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.time.LocalDate;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
public class Movie {

    private Integer id;
    private String name;
    private List<Actor> actors;
    private LocalDate releaseDate;
}
