package insat.company.platform.domain;


import javax.persistence.*;
import javax.validation.constraints.*;

import org.springframework.data.elasticsearch.annotations.Document;
import java.io.Serializable;
import java.util.Objects;

/**
 * A SlackChannel.
 */
@Entity
@Table(name = "slack_channel")
@Document(indexName = "slackchannel")
public class SlackChannel implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    @Column(name = "channel_id", nullable = false, unique = true)
    private String channelId;

    @NotNull
    @Column(name = "name", nullable = false)
    private String name;

    @NotNull
    @Column(name = "team_id", nullable = false)
    private String teamId;

    @NotNull
    @Column(name = "is_private", nullable = false)
    private Boolean isPrivate;

    // jhipster-needle-entity-add-field - JHipster will add fields here, do not remove
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getChannelId() {
        return channelId;
    }

    public SlackChannel channelId(String channelId) {
        this.channelId = channelId;
        return this;
    }

    public void setChannelId(String channelId) {
        this.channelId = channelId;
    }

    public String getName() {
        return name;
    }

    public SlackChannel name(String name) {
        this.name = name;
        return this;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTeamId() {
        return teamId;
    }

    public SlackChannel teamId(String teamId) {
        this.teamId = teamId;
        return this;
    }

    public void setTeamId(String teamId) {
        this.teamId = teamId;
    }

    public Boolean getIsPrivate() {
        return isPrivate;
    }

    public SlackChannel isPrivate(Boolean isPrivate) {
        this.isPrivate = isPrivate;
        return this;
    }

    public void setIsPrivate(Boolean isPrivate) {
        this.isPrivate = isPrivate;
    }
    // jhipster-needle-entity-add-getters-setters - JHipster will add getters and setters here, do not remove

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SlackChannel slackChannel = (SlackChannel) o;
        if (slackChannel.getId() == null || getId() == null) {
            return false;
        }
        return Objects.equals(getId(), slackChannel.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getId());
    }

    @Override
    public String toString() {
        return "SlackChannel{" +
            "id=" + getId() +
            ", channelId='" + getChannelId() + "'" +
            ", name='" + getName() + "'" +
            ", teamId='" + getTeamId() + "'" +
            ", isPrivate='" + getIsPrivate() + "'" +
            "}";
    }
}
