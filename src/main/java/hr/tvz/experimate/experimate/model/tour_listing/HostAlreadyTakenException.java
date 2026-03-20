package hr.tvz.experimate.experimate.model.tour_listing;

import hr.tvz.experimate.experimate.model.shared.ConflictException;

public class HostAlreadyTakenException extends ConflictException {
    public HostAlreadyTakenException(Integer id) {
        super("User with id %d already listed a tour.".formatted(id));
    }
}
