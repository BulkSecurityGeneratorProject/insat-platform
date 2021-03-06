package insat.company.platform.service;

import insat.company.platform.domain.SlackChannel;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.Optional;

/**
 * Service Interface for managing SlackChannel.
 */
public interface SlackChannelService {

    /**
     * Save a slackChannel.
     *
     * @param slackChannel the entity to save
     * @return the persisted entity
     */
    SlackChannel save(SlackChannel slackChannel);

    /**
     * Get all the slackChannels.
     *
     * @param pageable the pagination information
     * @return the list of entities
     */
    Page<SlackChannel> findAll(Pageable pageable);


    /**
     * Get the "id" slackChannel.
     *
     * @param id the id of the entity
     * @return the entity
     */
    Optional<SlackChannel> findOne(Long id);

    /**
     * Delete the "id" slackChannel.
     *
     * @param id the id of the entity
     */
    void delete(Long id);

    /**
     * Search for the slackChannel corresponding to the query.
     *
     * @param query the query of the search
     * 
     * @param pageable the pagination information
     * @return the list of entities
     */
    Page<SlackChannel> search(String query, Pageable pageable);
}
