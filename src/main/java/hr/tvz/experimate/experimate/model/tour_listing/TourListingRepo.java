package hr.tvz.experimate.experimate.model.tour_listing;

import hr.tvz.experimate.experimate.model.user.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

public interface TourListingRepo extends JpaRepository<TourListing, Integer> {
    boolean existsByHostAndMeetingDateBetween(User user, LocalDateTime start, LocalDateTime end);
}
