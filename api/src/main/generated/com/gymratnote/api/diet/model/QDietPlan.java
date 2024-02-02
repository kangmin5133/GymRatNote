package com.gymratnote.api.diet.model;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QDietPlan is a Querydsl query type for DietPlan
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QDietPlan extends EntityPathBase<DietPlan> {

    private static final long serialVersionUID = 21132547L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QDietPlan dietPlan = new QDietPlan("dietPlan");

    public final NumberPath<Integer> calories = createNumber("calories", Integer.class);

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath mealType = createString("mealType");

    public final StringPath nutrients = createString("nutrients");

    public final NumberPath<Integer> proteins = createNumber("proteins", Integer.class);

    public final com.gymratnote.api.common.model.QUser user;

    public QDietPlan(String variable) {
        this(DietPlan.class, forVariable(variable), INITS);
    }

    public QDietPlan(Path<? extends DietPlan> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QDietPlan(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QDietPlan(PathMetadata metadata, PathInits inits) {
        this(DietPlan.class, metadata, inits);
    }

    public QDietPlan(Class<? extends DietPlan> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.user = inits.isInitialized("user") ? new com.gymratnote.api.common.model.QUser(forProperty("user")) : null;
    }

}

