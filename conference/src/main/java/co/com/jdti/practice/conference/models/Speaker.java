package co.com.jdti.practice.conference.models;

import org.hibernate.annotations.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.ManyToMany;
import java.util.List;

@Entity(name = "speakers")
public class Speaker {

    @Id
    @Column(name = "speaker_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idSpeaker;

    @Column(name = "company")
    private String companyName;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "title")
    private String title;

    @Column(name = "speaker_bio")
    private String speakerBio;

    @Column(name = "speaker_photo")
    @Lob
    @Type(type = "org.hibernate.type.BinaryType")
    private byte[] speakerPhoto;

    @ManyToMany(mappedBy = "speakers")
    private List<Session> sessions;

    public Speaker() {
        // Empty constructor
    }

    public byte[] getSpeakerPhoto() {
        return speakerPhoto;
    }

    public void setSpeakerPhoto(byte[] speakerPhoto) {
        this.speakerPhoto = speakerPhoto;
    }

    public Long getIdSpeaker() {
        return idSpeaker;
    }

    public void setIdSpeaker(Long idSpeaker) {
        this.idSpeaker = idSpeaker;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSpeakerBio() {
        return speakerBio;
    }

    public void setSpeakerBio(String speakerBio) {
        this.speakerBio = speakerBio;
    }

    public List<Session> getSessions() {
        return sessions;
    }

    public void setSessions(List<Session> sessions) {
        this.sessions = sessions;
    }
}
