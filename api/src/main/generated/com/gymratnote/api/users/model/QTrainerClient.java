package com.gymratnote.api.users.model;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QTrainerClient is a Querydsl query type for TrainerClient
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QTrainerClient extends EntityPathBase<TrainerClient> {

    private static final long serialVersionUID = -1055031844L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QTrainerClient trainerClient = new QTrainerClient("trainerClient");

    public final com.gymratnote.api.common.model.QUser client;

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final com.gymratnote.api.common.model.QUser trainer;

    public QTrainerClient(String variable) {
        this(TrainerClient.class, forVariable(variable), INITS);
    }

    public QTrainerClient(Path<? extends TrainerClient> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QTrainerClient(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QTrainerClient(PathMetadata metadata, PathInits inits) {
        this(TrainerClient.class, metadata, inits);
    }

    public QTrainerClient(Class<? extends TrainerClient> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.client = inits.isInitialized("client") ? new com.gymratnote.api.common.model.QUser(forProperty("client")) : null;
        this.trainer = inits.isInitialized("trainer") ? new com.gymratnote.api.common.model.QUser(forProperty("trainer")) : null;
    }

}

