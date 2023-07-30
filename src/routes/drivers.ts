import * as express from "express";
import * as cors from "cors";
import * as helmet from "helmet";
import { getAllDrivers } from "../access/driverRepository";

const expressApp = express();
expressApp.use(helmet);
expressApp.use(cors);
console.log("Setting up application")

expressApp.listen(8080, () => {
    console.log("app listening on port 8080")
})

expressApp.get("/drivers", (req, res) => {
    console.log("Returning all drivers from DB")
    res.send(getAllDrivers())

})
