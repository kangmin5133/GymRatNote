package com.gymratnote.api.workout.model;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QTrainingDetail is a Querydsl query type for TrainingDetail
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QTrainingDetail extends EntityPathBase<TrainingDetail> {

    private static final long serialVersionUID = 2035850394L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QTrainingDetail trainingDetail = new QTrainingDetail("trainingDetail");

    public final QExercise exercise;

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final NumberPath<Integer> reps = createNumber("reps", Integer.class);

    public final NumberPath<Integer> sets = createNumber("sets", Integer.class);

    public final DateTimePath<java.util.Date> trainingDate = createDateTime("trainingDate", java.util.Date.class);

    public final com.gymratnote.api.common.model.QUser user;

    public final NumberPath<Double> weight = createNumber("weight", Double.class);

    public QTrainingDetail(String variable) {
        this(TrainingDetail.class, forVariable(variable), INITS);
    }

    public QTrainingDetail(Path<? extends TrainingDetail> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QTrainingDetail(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QTrainingDetail(PathMetadata metadata, PathInits inits) {
        this(TrainingDetail.class, metadata, inits);
    }

    public QTrainingDetail(Class<? extends TrainingDetail> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.exercise = inits.isInitialized("exercise") ? new QExercise(forProperty("exercise")) : null;
        this.user = inits.isInitialized("user") ? new com.gymratnote.api.common.model.QUser(forProperty("user")) : null;
    }

}

