package myWebProject.web.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QPostSpec is a Querydsl query type for PostSpec
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QPostSpec extends EntityPathBase<PostSpec> {

    private static final long serialVersionUID = -1950209426L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QPostSpec postSpec = new QPostSpec("postSpec");

    public final StringPath content = createString("content");

    public final StringPath contentTitle = createString("contentTitle");

    public final StringPath endDate = createString("endDate");

    public final DateTimePath<java.sql.Timestamp> firstRegTime = createDateTime("firstRegTime", java.sql.Timestamp.class);

    public final StringPath firstRegUser = createString("firstRegUser");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final DateTimePath<java.sql.Timestamp> lastRegTime = createDateTime("lastRegTime", java.sql.Timestamp.class);

    public final StringPath lastRegUser = createString("lastRegUser");

    public final QPost post;

    public final StringPath postComboName = createString("postComboName");

    public final StringPath postSpecCode = createString("postSpecCode");

    public final StringPath startDate = createString("startDate");

    public QPostSpec(String variable) {
        this(PostSpec.class, forVariable(variable), INITS);
    }

    public QPostSpec(Path<? extends PostSpec> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QPostSpec(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QPostSpec(PathMetadata metadata, PathInits inits) {
        this(PostSpec.class, metadata, inits);
    }

    public QPostSpec(Class<? extends PostSpec> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.post = inits.isInitialized("post") ? new QPost(forProperty("post"), inits.get("post")) : null;
    }

}

