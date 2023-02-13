package com.shtarev.FullApp.Entity;

import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.UUID;

@Data
@Table(name = "assigment")
@Entity
public class Assignment {
    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(
            name = "UUID",
            strategy = "org.hibernate.id.UUIDGenerator"
    )
    private UUID id;
    @Column(name = "status")
    private String status;
    @Column(name = "github_url")
    private String githubUrl;
    @Column(name = "branch")
    private String branch;
    @Column(name = "code_review_video_url")
    private String codeReviewVideoUrl;
    @ManyToOne(optional = false)
    @JoinColumn(name="assigned_to")
    private UserEntity assignedTo;
}
