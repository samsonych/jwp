package com.samsonych.model.wp;

// Generated 21.12.2010 7:24:07 by Hibernate Tools 3.4.0.Beta1

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.ManyToOne;

import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * WpPostmeta generated by hbm2java
 */
@Entity
@Table(name = "wp_postmeta")
public class PostMeta implements java.io.Serializable {

    private static final long serialVersionUID = -7240950919239724499L;
    private Long metaId;
    private Post post;
    private String metaKey;
    private String metaValue;

    public PostMeta() {
    }

    public PostMeta(Post post) {
        this.post = post;
    }

    public PostMeta(Post post, String metaKey, String metaValue) {
        this.post = post;
        this.metaKey = metaKey;
        this.metaValue = metaValue;
    }

    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "meta_id", unique = true, nullable = false)
    public Long getMetaId() {
        return this.metaId;
    }

    public void setMetaId(Long metaId) {
        this.metaId = metaId;
    }

    // @Column(name = "post_id", nullable = false)
    @ManyToOne(cascade = CascadeType.REFRESH, fetch = FetchType.LAZY)
    public Post getPost() {
        return this.post;
    }

    public void setPost(Post post) {
        this.post = post;
    }

    @Column(name = "meta_key")
    public String getMetaKey() {
        return this.metaKey;
    }

    public void setMetaKey(String metaKey) {
        this.metaKey = metaKey;
    }

    @Column(name = "meta_value")
    public String getMetaValue() {
        return this.metaValue;
    }

    public void setMetaValue(String metaValue) {
        this.metaValue = metaValue;
    }

}
