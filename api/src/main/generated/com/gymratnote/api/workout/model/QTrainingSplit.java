package com.gymratnote.api.workout.model;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QTrainingSplit is a Querydsl query type for TrainingSplit
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QTrainingSplit extends EntityPathBase<TrainingSplit> {

    private static final long serialVersionUID = 218393009L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QTrainingSplit trainingSplit = new QTrainingSplit("trainingSplit");

    public final StringPath bodyParts = createString("bodyParts");

    public final StringPath dayOfWeek = createString("dayOfWeek");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath splitType = createString("splitType");

    public final com.gymratnote.api.common.model.QUser user;

    public QTrainingSplit(String variable) {
        this(TrainingSplit.class, forVariable(variable), INITS);
    }

    public QTrainingSplit(Path<? extends TrainingSplit> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QTrainingSplit(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QTrainingSplit(PathMetadata metadata, PathInits inits) {
        this(TrainingSplit.class, metadata, inits);
    }

    public QTrainingSplit(Class<? extends TrainingSplit> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.user = inits.isInitialized("user") ? new com.gymratnote.api.common.model.QUser(forProperty("user")) : null;
    }

}

