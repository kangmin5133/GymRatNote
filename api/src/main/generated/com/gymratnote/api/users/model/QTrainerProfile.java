package com.gymratnote.api.users.model;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QTrainerProfile is a Querydsl query type for TrainerProfile
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QTrainerProfile extends EntityPathBase<TrainerProfile> {

    private static final long serialVersionUID = 483738040L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QTrainerProfile trainerProfile = new QTrainerProfile("trainerProfile");

    public final StringPath expertise = createString("expertise");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath qualifications = createString("qualifications");

    public final com.gymratnote.api.common.model.QUser user;

    public QTrainerProfile(String variable) {
        this(TrainerProfile.class, forVariable(variable), INITS);
    }

    public QTrainerProfile(Path<? extends TrainerProfile> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QTrainerProfile(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QTrainerProfile(PathMetadata metadata, PathInits inits) {
        this(TrainerProfile.class, metadata, inits);
    }

    public QTrainerProfile(Class<? extends TrainerProfile> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.user = inits.isInitialized("user") ? new com.gymratnote.api.common.model.QUser(forProperty("user")) : null;
    }

}

