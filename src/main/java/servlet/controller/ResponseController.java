package servlet.controller;

import java.io.IOException;
import java.io.Writer;

import javax.servlet.http.HttpServletResponse;

public class ResponseController {
    
    public static void sendErrorResponse(HttpServletResponse resp, int errorCode, String data) throws IOException {
        Writer responseWriter = resp.getWriter();

        resp.setStatus(errorCode);

        responseWriter.write(data);
        responseWriter.flush();
    }

    public static void sendSuccessResponse(HttpServletResponse resp, String data) throws IOException {
        Writer responseWriter = resp.getWriter();

        resp.setStatus(HttpServletResponse.SC_OK);

        responseWriter.write(data);
        responseWriter.flush();
    }

}
