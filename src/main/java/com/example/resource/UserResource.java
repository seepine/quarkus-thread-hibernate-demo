package com.example.resource;

import com.example.dao.UserDao;
import com.example.entity.User;
import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

import java.util.concurrent.ForkJoinPool;

@Path("/user")
public class UserResource {
  @Inject ForkJoinPool forkJoinPool;
  @Inject UserDao userDao;

  @GET
  @Path("save1")
  @Produces(MediaType.TEXT_PLAIN)
  public String save1() {
    forkJoinPool.execute(() -> userDao.save(User.builder().nickName("bob").build()));
    return "save1 end";
  }

  @GET
  @Path("save2")
  @Produces(MediaType.TEXT_PLAIN)
  public String save2() {
    userDao.save(User.builder().nickName("cat").build());
    return "save2 end";
  }
}
