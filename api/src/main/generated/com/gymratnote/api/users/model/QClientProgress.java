package com.gymratnote.api.users.model;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QClientProgress is a Querydsl query type for ClientProgress
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QClientProgress extends EntityPathBase<ClientProgress> {

    private static final long serialVersionUID = 1428660636L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QClientProgress clientProgress = new QClientProgress("clientProgress");

    public final NumberPath<Double> bodyFat = createNumber("bodyFat", Double.class);

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath progressNotes = createString("progressNotes");

    public final com.gymratnote.api.common.model.QUser user;

    public final NumberPath<Double> weight = createNumber("weight", Double.class);

    public QClientProgress(String variable) {
        this(ClientProgress.class, forVariable(variable), INITS);
    }

    public QClientProgress(Path<? extends ClientProgress> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QClientProgress(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QClientProgress(PathMetadata metadata, PathInits inits) {
        this(ClientProgress.class, metadata, inits);
    }

    public QClientProgress(Class<? extends ClientProgress> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.user = inits.isInitialized("user") ? new com.gymratnote.api.common.model.QUser(forProperty("user")) : null;
    }

}

