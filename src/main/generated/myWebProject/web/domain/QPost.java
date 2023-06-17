package myWebProject.web.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QPost is a Querydsl query type for Post
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QPost extends EntityPathBase<Post> {

    private static final long serialVersionUID = 705626131L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QPost post = new QPost("post");

    public final DateTimePath<java.sql.Timestamp> firstRegTime = createDateTime("firstRegTime", java.sql.Timestamp.class);

    public final StringPath firstRegUser = createString("firstRegUser");

    public final DateTimePath<java.sql.Timestamp> lastRegTime = createDateTime("lastRegTime", java.sql.Timestamp.class);

    public final StringPath lastRegUser = createString("lastRegUser");

    public final NumberPath<Long> postId = createNumber("postId", Long.class);

    public final QPostSpec postSpec;

    public final NumberPath<Long> searchCount = createNumber("searchCount", Long.class);

    public final StringPath title = createString("title");

    public QPost(String variable) {
        this(Post.class, forVariable(variable), INITS);
    }

    public QPost(Path<? extends Post> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QPost(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QPost(PathMetadata metadata, PathInits inits) {
        this(Post.class, metadata, inits);
    }

    public QPost(Class<? extends Post> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.postSpec = inits.isInitialized("postSpec") ? new QPostSpec(forProperty("postSpec"), inits.get("postSpec")) : null;
    }

}

