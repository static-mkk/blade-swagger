package com.blade.controller;

import com.blade.mvc.annotation.GetRoute;
import com.blade.mvc.annotation.Path;
import com.blade.mvc.http.Response;
import com.blade.self.apiannotation.Api;
import com.blade.self.apiannotation.ApiOperation;

@Path
@Api(value = "percontoller", description = "小明 pet")
public class PetTestController {

    @GetRoute("/getPet")
    @ApiOperation(value = "apiOperation" )
    private void getPet(Response response) {

        response.text("woshi  PetTestController 的 getPet");
    }
}
