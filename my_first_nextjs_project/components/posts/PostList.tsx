import React from "react";
import PostCard from "@/components/posts/PostCard";
import {data} from "autoprefixer";
import {PostProps} from "@/Types/Types";


async function getPosts() {
    const res = await fetch("https://jsonplaceholder.typicode.com/posts");
    if (!res.ok) throw new Error(res.statusText);
    return await res.json();
}

const PostList = async () => {

    const posts: PostProps[] = await getPosts();

    return <div className="postList">

        {posts.map((post) => (
            <PostCard key={post.id} {...post} />
        ))};
    </div>
        ;
}

export default PostList;