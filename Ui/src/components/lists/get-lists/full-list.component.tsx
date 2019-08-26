import React, { Component } from 'react';
import { environment } from '../../../environment';
import { Lists } from '../../../models/list';

interface IState {
    lists: Lists[]
}

export default class GroceryLists extends Component<{}, IState> {
    constructor(props: any) {
        super(props);
        this.state = {
            lists: []
        };
    }

    async componentDidMount() {
        this.getLists();
    };
    getLists = async () => {
        const resp = await fetch(environment.context + '/items/' + sessionStorage.getItem(""), {
            credentials: 'include'
        });
        const listsFromServer = await resp.json();
        this.setState({
            lists: listsFromServer,
        });
    }

    render() {
        const lists = this.state.lists;
        return (
            <div>
                <table className="table table-hover">
                    <thead className="fr-thead">
                        <tr>
                            <th scope="col">Item Id</th>
                            <th scope="col">amount</th>
                            <th scope="col">Item Name</th>
                            <th scope="col">Item Type</th>
                        </tr>
                    </thead>
                    <tbody>
                                <tr key={'listId-' + 1}>
                                    <td>1</td>
                                    <td>2</td>
                                    <td>dress shirt</td>
                                    <td>clothing</td>
                                </tr>
                                <tr key={'listId-' + 2}>
                                    <td>2</td>
                                    <td>8</td>
                                    <td>apples</td>
                                    <td>food</td>
                                </tr>
                                <tr key={'listId-' + 3}>
                                    <td>3</td>
                                    <td>1</td>
                                    <td>ps4 controller</td>
                                    <td>electronic</td>
                                </tr>
                                <tr key={'listId-' + 4}>
                                    <td>4</td>
                                    <td>1</td>
                                    <td>dish liquid</td>
                                    <td>houseware</td>
                                </tr>
                                <tr key={'listId-' + 5}>
                                    <td>5</td>
                                    <td>1</td>
                                    <td>joking hazard</td>
                                    <td>entertainment</td>
                                </tr>
                                <tr key={'listId-' + 6}>
                                    <td>6</td>
                                    <td>2</td>
                                    <td>pita bread</td>
                                    <td>food</td>
                                </tr>
                                
                    </tbody>
                </table>
            </div>
        )
    }
}