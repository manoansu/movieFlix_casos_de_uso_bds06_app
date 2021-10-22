package pt.amane.movieflix.dtos;

import java.io.Serializable;

import pt.amane.movieflix.entities.Movie;
import pt.amane.movieflix.entities.Review;
import pt.amane.movieflix.entities.User;

public class ReviewDTO implements Serializable {

	private static final long serialVersionUID = 1L;

	private Long id;
	private String text;
	private Long movieId;

	public ReviewDTO() {
	}

	public ReviewDTO(Long id, String text) {
		super();
		this.id = id;
		this.text = text;
	}

	public ReviewDTO(Review review) {
		super();
		id = review.getId();
		text = review.getText();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public Long getMovieId() {
		return movieId;
	}

	public void setMovieId(Long movieId) {
		this.movieId = movieId;
	}

}
